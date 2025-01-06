/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/quaternion.proto

// Protobuf Java Version: 3.25.5
package com.google.type;

public final class QuaternionProto {
  private QuaternionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_type_Quaternion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_type_Quaternion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\034google/type/quaternion.proto\022\013google.t"
          + "ype\"8\n\nQuaternion\022\t\n\001x\030\001 \001(\001\022\t\n\001y\030\002 \001(\001\022"
          + "\t\n\001z\030\003 \001(\001\022\t\n\001w\030\004 \001(\001Bo\n\017com.google.type"
          + "B\017QuaternionProtoP\001Z@google.golang.org/g"
          + "enproto/googleapis/type/quaternion;quate"
          + "rnion\370\001\001\242\002\003GTPb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_type_Quaternion_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_type_Quaternion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_type_Quaternion_descriptor,
            new java.lang.String[] {
              "X", "Y", "Z", "W",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
