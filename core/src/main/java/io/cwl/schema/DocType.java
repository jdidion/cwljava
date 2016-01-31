
/*****************************************************************************************************
*
*  Authors:
*
*****************************************************************************************************/

package io.cwl.schema;

public class DocType {

 String docParent = null;
 Object doc = null;
 String docAfter = null;
 Object docChild = null;

  public DocType() { super(); }

 public void setdocParent( String value ) {
   docParent = value;
 }

 public String getdocParent() {
   return docParent;
 }

 public void setdoc( String value ) {
   doc = value;
 }

 public void setdoc( String [] value ) {
   doc = value;
 }

 public Object getdoc() {
   return doc;
 }

 public void setdocAfter( String value ) {
   docAfter = value;
 }

 public String getdocAfter() {
   return docAfter;
 }

 public void setdocChild( String value ) {
   docChild = value;
 }

 public void setdocChild( String [] value ) {
   docChild = value;
 }

 public Object getdocChild() {
   return docChild;
 }

}