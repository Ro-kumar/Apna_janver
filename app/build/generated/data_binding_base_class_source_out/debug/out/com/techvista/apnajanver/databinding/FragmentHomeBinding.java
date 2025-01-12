// Generated by view binder compiler. Do not edit!
package com.techvista.apnajanver.databinding;

import alirezat775.lib.carouselview.CarouselView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.techvista.apnajanver.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CarouselView carouselView;

  @NonNull
  public final TextView catViewall;

  @NonNull
  public final TextView edSearch;

  @NonNull
  public final ImageView langauage;

  @NonNull
  public final RecyclerView recyclerCategory;

  @NonNull
  public final RecyclerView recyclerNearyby;

  @NonNull
  public final LinearLayout search;

  @NonNull
  public final TextView txtAddress;

  @NonNull
  public final TextView txtViewall;

  private FragmentHomeBinding(@NonNull LinearLayout rootView, @NonNull CarouselView carouselView,
      @NonNull TextView catViewall, @NonNull TextView edSearch, @NonNull ImageView langauage,
      @NonNull RecyclerView recyclerCategory, @NonNull RecyclerView recyclerNearyby,
      @NonNull LinearLayout search, @NonNull TextView txtAddress, @NonNull TextView txtViewall) {
    this.rootView = rootView;
    this.carouselView = carouselView;
    this.catViewall = catViewall;
    this.edSearch = edSearch;
    this.langauage = langauage;
    this.recyclerCategory = recyclerCategory;
    this.recyclerNearyby = recyclerNearyby;
    this.search = search;
    this.txtAddress = txtAddress;
    this.txtViewall = txtViewall;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.carousel_view;
      CarouselView carouselView = ViewBindings.findChildViewById(rootView, id);
      if (carouselView == null) {
        break missingId;
      }

      id = R.id.cat_viewall;
      TextView catViewall = ViewBindings.findChildViewById(rootView, id);
      if (catViewall == null) {
        break missingId;
      }

      id = R.id.ed_search;
      TextView edSearch = ViewBindings.findChildViewById(rootView, id);
      if (edSearch == null) {
        break missingId;
      }

      id = R.id.langauage;
      ImageView langauage = ViewBindings.findChildViewById(rootView, id);
      if (langauage == null) {
        break missingId;
      }

      id = R.id.recycler_category;
      RecyclerView recyclerCategory = ViewBindings.findChildViewById(rootView, id);
      if (recyclerCategory == null) {
        break missingId;
      }

      id = R.id.recycler_nearyby;
      RecyclerView recyclerNearyby = ViewBindings.findChildViewById(rootView, id);
      if (recyclerNearyby == null) {
        break missingId;
      }

      id = R.id.search;
      LinearLayout search = ViewBindings.findChildViewById(rootView, id);
      if (search == null) {
        break missingId;
      }

      id = R.id.txt_address;
      TextView txtAddress = ViewBindings.findChildViewById(rootView, id);
      if (txtAddress == null) {
        break missingId;
      }

      id = R.id.txt_viewall;
      TextView txtViewall = ViewBindings.findChildViewById(rootView, id);
      if (txtViewall == null) {
        break missingId;
      }

      return new FragmentHomeBinding((LinearLayout) rootView, carouselView, catViewall, edSearch,
          langauage, recyclerCategory, recyclerNearyby, search, txtAddress, txtViewall);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
