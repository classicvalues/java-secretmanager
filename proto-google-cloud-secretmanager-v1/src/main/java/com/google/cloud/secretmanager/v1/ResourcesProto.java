/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/secretmanager/v1/resources.proto

package com.google.cloud.secretmanager.v1;

public final class ResourcesProto {
  private ResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Secret_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Secret_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Secret_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Secret_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_SecretVersion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_SecretVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Replication_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Replication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Replication_Automatic_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Replication_Automatic_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_Replica_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_Replica_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryption_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryption_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_ReplicationStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_ReplicationStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_ReplicationStatus_AutomaticStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_ReplicationStatus_AutomaticStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_ReplicaStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_ReplicaStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryptionStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryptionStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Topic_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Topic_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_Rotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_Rotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_secretmanager_v1_SecretPayload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_SecretPayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/secretmanager/v1/resource"
          + "s.proto\022\035google.cloud.secretmanager.v1\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\032\036google/protobuf/dura"
          + "tion.proto\032\037google/protobuf/timestamp.pr"
          + "oto\032\034google/api/annotations.proto\"\313\004\n\006Se"
          + "cret\022\021\n\004name\030\001 \001(\tB\003\340A\003\022G\n\013replication\030\002"
          + " \001(\0132*.google.cloud.secretmanager.v1.Rep"
          + "licationB\006\340A\005\340A\002\0224\n\013create_time\030\003 \001(\0132\032."
          + "google.protobuf.TimestampB\003\340A\003\022A\n\006labels"
          + "\030\004 \003(\01321.google.cloud.secretmanager.v1.S"
          + "ecret.LabelsEntry\0229\n\006topics\030\005 \003(\0132$.goog"
          + "le.cloud.secretmanager.v1.TopicB\003\340A\001\0226\n\013"
          + "expire_time\030\006 \001(\0132\032.google.protobuf.Time"
          + "stampB\003\340A\001H\000\022-\n\003ttl\030\007 \001(\0132\031.google.proto"
          + "buf.DurationB\003\340A\004H\000\022>\n\010rotation\030\t \001(\0132\'."
          + "google.cloud.secretmanager.v1.RotationB\003"
          + "\340A\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value"
          + "\030\002 \001(\t:\0028\001:M\352AJ\n#secretmanager.googleapi"
          + "s.com/Secret\022#projects/{project}/secrets"
          + "/{secret}B\014\n\nexpiration\"\337\003\n\rSecretVersio"
          + "n\022\021\n\004name\030\001 \001(\tB\003\340A\003\0224\n\013create_time\030\002 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\0225\n\014de"
          + "stroy_time\030\003 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\022F\n\005state\030\004 \001(\01622.google.cloud."
          + "secretmanager.v1.SecretVersion.StateB\003\340A"
          + "\003\022L\n\022replication_status\030\005 \001(\01320.google.c"
          + "loud.secretmanager.v1.ReplicationStatus\""
          + "H\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007ENABL"
          + "ED\020\001\022\014\n\010DISABLED\020\002\022\r\n\tDESTROYED\020\003:n\352Ak\n*"
          + "secretmanager.googleapis.com/SecretVersi"
          + "on\022=projects/{project}/secrets/{secret}/"
          + "versions/{secret_version}\"\220\004\n\013Replicatio"
          + "n\022I\n\tautomatic\030\001 \001(\01324.google.cloud.secr"
          + "etmanager.v1.Replication.AutomaticH\000\022N\n\014"
          + "user_managed\030\002 \001(\01326.google.cloud.secret"
          + "manager.v1.Replication.UserManagedH\000\032o\n\t"
          + "Automatic\022b\n\033customer_managed_encryption"
          + "\030\001 \001(\01328.google.cloud.secretmanager.v1.C"
          + "ustomerManagedEncryptionB\003\340A\001\032\345\001\n\013UserMa"
          + "naged\022U\n\010replicas\030\001 \003(\0132>.google.cloud.s"
          + "ecretmanager.v1.Replication.UserManaged."
          + "ReplicaB\003\340A\002\032\177\n\007Replica\022\020\n\010location\030\001 \001("
          + "\t\022b\n\033customer_managed_encryption\030\002 \001(\01328"
          + ".google.cloud.secretmanager.v1.CustomerM"
          + "anagedEncryptionB\003\340A\001B\r\n\013replication\"6\n\031"
          + "CustomerManagedEncryption\022\031\n\014kms_key_nam"
          + "e\030\001 \001(\tB\003\340A\002\"\353\004\n\021ReplicationStatus\022U\n\tau"
          + "tomatic\030\001 \001(\0132@.google.cloud.secretmanag"
          + "er.v1.ReplicationStatus.AutomaticStatusH"
          + "\000\022Z\n\014user_managed\030\002 \001(\0132B.google.cloud.s"
          + "ecretmanager.v1.ReplicationStatus.UserMa"
          + "nagedStatusH\000\032{\n\017AutomaticStatus\022h\n\033cust"
          + "omer_managed_encryption\030\001 \001(\0132>.google.c"
          + "loud.secretmanager.v1.CustomerManagedEnc"
          + "ryptionStatusB\003\340A\003\032\217\002\n\021UserManagedStatus"
          + "\022g\n\010replicas\030\001 \003(\0132P.google.cloud.secret"
          + "manager.v1.ReplicationStatus.UserManaged"
          + "Status.ReplicaStatusB\003\340A\003\032\220\001\n\rReplicaSta"
          + "tus\022\025\n\010location\030\001 \001(\tB\003\340A\003\022h\n\033customer_m"
          + "anaged_encryption\030\002 \001(\0132>.google.cloud.s"
          + "ecretmanager.v1.CustomerManagedEncryptio"
          + "nStatusB\003\340A\003B\024\n\022replication_status\"D\n\037Cu"
          + "stomerManagedEncryptionStatus\022!\n\024kms_key"
          + "_version_name\030\001 \001(\tB\003\340A\002\"_\n\005Topic\022\021\n\004nam"
          + "e\030\001 \001(\tB\003\340A\002:C\352A@\n\033pubsub.googleapis.com"
          + "/Topic\022!projects/{project}/topics/{topic"
          + "}\"\200\001\n\010Rotation\022;\n\022next_rotation_time\030\001 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\001\0227\n\017r"
          + "otation_period\030\002 \001(\0132\031.google.protobuf.D"
          + "urationB\003\340A\004\"\035\n\rSecretPayload\022\014\n\004data\030\001 "
          + "\001(\014B\355\001\n!com.google.cloud.secretmanager.v"
          + "1B\016ResourcesProtoP\001ZJgoogle.golang.org/g"
          + "enproto/googleapis/cloud/secretmanager/v"
          + "1;secretmanager\370\001\001\242\002\003GSM\252\002\035Google.Cloud."
          + "SecretManager.V1\312\002\035Google\\Cloud\\SecretMa"
          + "nager\\V1\352\002 Google::Cloud::SecretManager:"
          + ":V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_secretmanager_v1_Secret_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_secretmanager_v1_Secret_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Secret_descriptor,
            new java.lang.String[] {
              "Name",
              "Replication",
              "CreateTime",
              "Labels",
              "Topics",
              "ExpireTime",
              "Ttl",
              "Rotation",
              "Expiration",
            });
    internal_static_google_cloud_secretmanager_v1_Secret_LabelsEntry_descriptor =
        internal_static_google_cloud_secretmanager_v1_Secret_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_secretmanager_v1_Secret_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Secret_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_secretmanager_v1_SecretVersion_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_secretmanager_v1_SecretVersion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_SecretVersion_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "DestroyTime", "State", "ReplicationStatus",
            });
    internal_static_google_cloud_secretmanager_v1_Replication_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_secretmanager_v1_Replication_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Replication_descriptor,
            new java.lang.String[] {
              "Automatic", "UserManaged", "Replication",
            });
    internal_static_google_cloud_secretmanager_v1_Replication_Automatic_descriptor =
        internal_static_google_cloud_secretmanager_v1_Replication_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_secretmanager_v1_Replication_Automatic_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Replication_Automatic_descriptor,
            new java.lang.String[] {
              "CustomerManagedEncryption",
            });
    internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_descriptor =
        internal_static_google_cloud_secretmanager_v1_Replication_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_descriptor,
            new java.lang.String[] {
              "Replicas",
            });
    internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_Replica_descriptor =
        internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_Replica_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Replication_UserManaged_Replica_descriptor,
            new java.lang.String[] {
              "Location", "CustomerManagedEncryption",
            });
    internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryption_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryption_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryption_descriptor,
            new java.lang.String[] {
              "KmsKeyName",
            });
    internal_static_google_cloud_secretmanager_v1_ReplicationStatus_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_secretmanager_v1_ReplicationStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_ReplicationStatus_descriptor,
            new java.lang.String[] {
              "Automatic", "UserManaged", "ReplicationStatus",
            });
    internal_static_google_cloud_secretmanager_v1_ReplicationStatus_AutomaticStatus_descriptor =
        internal_static_google_cloud_secretmanager_v1_ReplicationStatus_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_secretmanager_v1_ReplicationStatus_AutomaticStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_ReplicationStatus_AutomaticStatus_descriptor,
            new java.lang.String[] {
              "CustomerManagedEncryption",
            });
    internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_descriptor =
        internal_static_google_cloud_secretmanager_v1_ReplicationStatus_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_descriptor,
            new java.lang.String[] {
              "Replicas",
            });
    internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_ReplicaStatus_descriptor =
        internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_ReplicaStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_ReplicationStatus_UserManagedStatus_ReplicaStatus_descriptor,
            new java.lang.String[] {
              "Location", "CustomerManagedEncryption",
            });
    internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryptionStatus_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryptionStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_CustomerManagedEncryptionStatus_descriptor,
            new java.lang.String[] {
              "KmsKeyVersionName",
            });
    internal_static_google_cloud_secretmanager_v1_Topic_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_secretmanager_v1_Topic_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Topic_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_secretmanager_v1_Rotation_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_secretmanager_v1_Rotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_Rotation_descriptor,
            new java.lang.String[] {
              "NextRotationTime", "RotationPeriod",
            });
    internal_static_google_cloud_secretmanager_v1_SecretPayload_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_secretmanager_v1_SecretPayload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_secretmanager_v1_SecretPayload_descriptor,
            new java.lang.String[] {
              "Data",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
