// Generated by data binding compiler. Do not edit!
package br.com.xhantusgalius.meus_apps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import br.com.xhantusgalius.meus_apps.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSobreBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout sobre;

  protected FragmentSobreBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout sobre) {
    super(_bindingComponent, _root, _localFieldCount);
    this.sobre = sobre;
  }

  @NonNull
  public static FragmentSobreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_sobre, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSobreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSobreBinding>inflateInternal(inflater, R.layout.fragment_sobre, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSobreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_sobre, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSobreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSobreBinding>inflateInternal(inflater, R.layout.fragment_sobre, null, false, component);
  }

  public static FragmentSobreBinding bind(@NonNull View view) {
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
  public static FragmentSobreBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSobreBinding)bind(component, view, R.layout.fragment_sobre);
  }
}
