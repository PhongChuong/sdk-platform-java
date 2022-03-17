// Copyright 2022 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.generator.gapic.model;

import com.google.api.generator.engine.ast.BlockComment;
import com.google.api.generator.engine.ast.CommentStatement;
import com.google.api.generator.engine.ast.LineComment;
import com.google.api.generator.engine.ast.Statement;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class SampleTest {
  private final RegionTag regionTag =
      RegionTag.builder().setServiceName("serviceName").setRpcName("rpcName").build();
  private final List<Statement> sampleBody =
      Arrays.asList(CommentStatement.withComment(LineComment.withComment("testing")));
  private final List<CommentStatement> header =
      Arrays.asList(CommentStatement.withComment(BlockComment.withComment("apache license")));

  @Test
  public void sampleNoRegionTag() {
    Assert.assertThrows(
        IllegalStateException.class,
        () -> Sample.builder().setBody(sampleBody).setFileHeader(header).build());
  }

  @Test
  public void sampleValidMissingFields() {
    Sample sample = Sample.builder().setRegionTag(regionTag).build();

    Assert.assertEquals(ImmutableList.of(), sample.fileHeader());
    Assert.assertEquals(ImmutableList.of(), sample.body());
    Assert.assertEquals(ImmutableList.of(), sample.variableAssignments());
  }

  @Test
  public void sampleWithHeader() {
    Sample sample = Sample.builder().setRegionTag(regionTag).setBody(sampleBody).build();
    Assert.assertEquals(ImmutableList.of(), sample.fileHeader());

    sample = sample.withHeader(header);
    Assert.assertEquals(header, sample.fileHeader());
  }

  @Test
  public void sampleNameWithRegionTag() {
    Sample sample = Sample.builder().setRegionTag(regionTag).build();
    Assert.assertEquals("SyncRpcName", sample.name());

    RegionTag rt = regionTag.toBuilder().setOverloadDisambiguation("disambiguation").build();
    sample = sample.withRegionTag(rt);
    Assert.assertEquals("SyncRpcNameDisambiguation", sample.name());

    rt = rt.toBuilder().setIsAsynchronous(true).build();
    sample = sample.withRegionTag(rt);
    Assert.assertEquals("AsyncRpcNameDisambiguation", sample.name());
  }
}
