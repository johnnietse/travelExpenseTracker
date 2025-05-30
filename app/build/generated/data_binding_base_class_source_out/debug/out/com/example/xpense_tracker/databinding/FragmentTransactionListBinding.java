// Generated by view binder compiler. Do not edit!
package com.example.xpense_tracker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.xpense_tracker.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class FragmentTransactionListBinding implements ViewBinding {
  @NonNull
  private final RecyclerView rootView;

  @NonNull
  public final RecyclerView recyclerView;

  private FragmentTransactionListBinding(@NonNull RecyclerView rootView,
      @NonNull RecyclerView recyclerView) {
    this.rootView = rootView;
    this.recyclerView = recyclerView;
  }

  @Override
  @NonNull
  public RecyclerView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTransactionListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTransactionListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_transaction_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTransactionListBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    RecyclerView recyclerView = (RecyclerView) rootView;

    return new FragmentTransactionListBinding((RecyclerView) rootView, recyclerView);
  }
}
