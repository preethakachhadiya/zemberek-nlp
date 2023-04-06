// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: morphology.proto

package zemberek.proto.morphology;

public interface SentenceAnalysisRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zemberek.morphology.SentenceAnalysisRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * sentence string
   * </pre>
   *
   * <code>string input = 1;</code>
   */
  java.lang.String getInput();
  /**
   * <pre>
   * sentence string
   * </pre>
   *
   * <code>string input = 1;</code>
   */
  com.google.protobuf.ByteString
      getInputBytes();

  /**
   * <pre>
   * if [true], all analyses of all tokens will be included in the response
   * else, only the best analysis will be used.
   * </pre>
   *
   * <code>bool containAllAnalyses = 2;</code>
   */
  boolean getContainAllAnalyses();
}
