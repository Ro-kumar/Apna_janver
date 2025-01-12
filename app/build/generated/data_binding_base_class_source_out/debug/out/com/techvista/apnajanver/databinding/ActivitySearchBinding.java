// Generated by view binder compiler. Do not edit!
package com.techvista.apnajanver.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.techvista.apnajanver.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySearchBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView back;

  @NonNull
  public final EditText editSearch;

  @NonNull
  public final RelativeLayout search;

  @NonNull
  public final ImageView searchVoice;

  @NonNull
  public final TextView title;

  private ActivitySearchBinding(@NonNull LinearLayout rootView, @NonNull ImageView back,
      @NonNull EditText editSearch, @NonNull RelativeLayout search, @NonNull ImageView searchVoice,
      @NonNull TextView title) {
    this.rootView = rootView;
    this.back = back;
    this.editSearch = editSearch;
    this.search = search;
    this.searchVoice = searchVoice;
    this.title = title;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      ImageView back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.edit_search;
      EditText editSearch = ViewBindings.findChildViewById(rootView, id);
      if (editSearch == null) {
        break missingId;
      }

      id = R.id.search;
      RelativeLayout search = ViewBindings.findChildViewById(rootView, id);
      if (search == null) {
        break missingId;
      }

      id = R.id.search_voice;
      ImageView searchVoice = ViewBindings.findChildViewById(rootView, id);
      if (searchVoice == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new ActivitySearchBinding((LinearLayout) rootView, back, editSearch, search,
          searchVoice, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
