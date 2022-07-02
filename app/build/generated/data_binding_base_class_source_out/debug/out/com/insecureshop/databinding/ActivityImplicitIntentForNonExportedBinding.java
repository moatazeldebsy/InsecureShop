// Generated by data binding compiler. Do not edit!
package com.insecureshop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.insecureshop.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityImplicitIntentForNonExportedBinding extends ViewDataBinding {
  @NonNull
  public final Button logout;

  @NonNull
  public final Toolbar toolbar;

  protected ActivityImplicitIntentForNonExportedBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button logout, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.logout = logout;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityImplicitIntentForNonExportedBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_implicit_intent_for_non_exported, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityImplicitIntentForNonExportedBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityImplicitIntentForNonExportedBinding>inflateInternal(inflater, R.layout.activity_implicit_intent_for_non_exported, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityImplicitIntentForNonExportedBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_implicit_intent_for_non_exported, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityImplicitIntentForNonExportedBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable Object component) {
    return ViewDataBinding.<ActivityImplicitIntentForNonExportedBinding>inflateInternal(inflater, R.layout.activity_implicit_intent_for_non_exported, null, false, component);
  }

  public static ActivityImplicitIntentForNonExportedBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityImplicitIntentForNonExportedBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityImplicitIntentForNonExportedBinding)bind(component, view, R.layout.activity_implicit_intent_for_non_exported);
  }
}
