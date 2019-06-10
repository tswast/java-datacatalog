// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog;

public interface RenameTagTemplateFieldRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.RenameTagTemplateFieldRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the tag template. For example,
   * "projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}/fields/{tag_template_field_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the tag template. For example,
   * "projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}/fields/{tag_template_field_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The new ID of this tag template field. For example,
   * "my_new_field".
   * </pre>
   *
   * <code>string new_tag_template_field_id = 2;</code>
   */
  java.lang.String getNewTagTemplateFieldId();
  /**
   *
   *
   * <pre>
   * Required. The new ID of this tag template field. For example,
   * "my_new_field".
   * </pre>
   *
   * <code>string new_tag_template_field_id = 2;</code>
   */
  com.google.protobuf.ByteString getNewTagTemplateFieldIdBytes();
}
