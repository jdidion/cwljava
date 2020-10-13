package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.Savable;

/**
* Auto-generated interface for <I>https://w3id.org/cwl/cwl#CommandInputRecordSchema</I><BR>This interface is implemented by {@link CommandInputRecordSchemaImpl}<BR>
 */
public interface CommandInputRecordSchema extends InputRecordSchema, CommandInputSchema, CommandLineBindable, Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#IOSchema/name</I><BR>
   * <BLOCKQUOTE>
   * The identifier for this type   * </BLOCKQUOTE>
   */

  java.util.Optional<String> getName();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#fields</I><BR>
   * <BLOCKQUOTE>
   * Defines the fields of the record.   * </BLOCKQUOTE>
   */

  java.util.Optional<java.util.List<Object>> getFields();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#type</I><BR>
   * <BLOCKQUOTE>
   * Must be `record`   * </BLOCKQUOTE>
   */

  enum_d9cba076fca539106791a4f46d198c7fcfbdb779 getType();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Labeled/label</I><BR>
   * <BLOCKQUOTE>
   * A short, human-readable label of this object.   * </BLOCKQUOTE>
   */

  java.util.Optional<String> getLabel();
  /**
   * Getter for property <I>https://w3id.org/cwl/salad#Documented/doc</I><BR>
   * <BLOCKQUOTE>
   * A documentation string for this object, or an array of strings which should be concatenated.   * </BLOCKQUOTE>
   */

  Object getDoc();
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#CommandLineBindable/inputBinding</I><BR>
   * <BLOCKQUOTE>
   * Describes how to turn this object into command line arguments.   * </BLOCKQUOTE>
   */

  java.util.Optional<CommandLineBinding> getInputBinding();
}