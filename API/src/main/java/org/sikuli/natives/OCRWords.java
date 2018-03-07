/*
 * Copyright (c) 2010-2017, sikuli.org, sikulix.com - MIT license
 */

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sikuli.natives;

public class OCRWords {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OCRWords(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OCRWords obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        VisionProxyJNI.delete_OCRWords(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public OCRWords() {
    this(VisionProxyJNI.new_OCRWords__SWIG_0(), true);
  }

  public OCRWords(long n) {
    this(VisionProxyJNI.new_OCRWords__SWIG_1(n), true);
  }

  public long size() {
    return VisionProxyJNI.OCRWords_size(swigCPtr, this);
  }

  public long capacity() {
    return VisionProxyJNI.OCRWords_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    VisionProxyJNI.OCRWords_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return VisionProxyJNI.OCRWords_isEmpty(swigCPtr, this);
  }

  public void clear() {
    VisionProxyJNI.OCRWords_clear(swigCPtr, this);
  }

  public void add(OCRWord x) {
    VisionProxyJNI.OCRWords_add(swigCPtr, this, OCRWord.getCPtr(x), x);
  }

  public OCRWord get(int i) {
    return new OCRWord(VisionProxyJNI.OCRWords_get(swigCPtr, this, i), false);
  }

  public void set(int i, OCRWord val) {
    VisionProxyJNI.OCRWords_set(swigCPtr, this, i, OCRWord.getCPtr(val), val);
  }

}