// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: preprocess.proto

package zemberek.proto;

public interface TokenizationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zemberek.preprocessor.TokenizationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string input = 1;</code>
   */
  java.lang.String getInput();
  /**
   * <code>string input = 1;</code>
   */
  com.google.protobuf.ByteString
      getInputBytes();

  /**
   * <code>bool includeTokenBoundaries = 2;</code>
   */
  boolean getIncludeTokenBoundaries();

  /**
   * <pre>
   * TODO: Add options (ignore etc.)
   * </pre>
   *
   * <code>bool ignoreDoubleQuotes = 3;</code>
   */
  boolean getIgnoreDoubleQuotes();
}
