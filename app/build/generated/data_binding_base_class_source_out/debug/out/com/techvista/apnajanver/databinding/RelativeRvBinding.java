// Generated by view binder compiler. Do not edit!
package com.techvista.apnajanver.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.techvista.apnajanver.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RelativeRvBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView addWishlist;

  @NonNull
  public final TextView address;

  @NonNull
  public final MaterialCardView card;

  @NonNull
  public final ImageView img;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView service;

  private RelativeRvBinding(@NonNull LinearLayout rootView, @NonNull ImageView addWishlist,
      @NonNull TextView address, @NonNull MaterialCardView card, @NonNull ImageView img,
      @NonNull TextView name, @NonNull TextView service) {
    this.rootView = rootView;
    this.addWishlist = addWishlist;
    this.address = address;
    this.card = card;
    this.img = img;
    this.name = name;
    this.service = service;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RelativeRvBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RelativeRvBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.relative_rv, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RelativeRvBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_wishlist;
      ImageView addWishlist = ViewBindings.findChildViewById(rootView, id);
      if (addWishlist == null) {
        break missingId;
      }

      id = R.id.address;
      TextView address = ViewBindings.findChildViewById(rootView, id);
      if (address == null) {
        break missingId;
      }

      id = R.id.card;
      MaterialCardView card = ViewBindings.findChildViewById(rootView, id);
      if (card == null) {
        break missingId;
      }

      id = R.id.img;
      ImageView img = ViewBindings.findChildViewById(rootView, id);
      if (img == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.service;
      TextView service = ViewBindings.findChildViewById(rootView, id);
      if (service == null) {
        break missingId;
      }

      return new RelativeRvBinding((LinearLayout) rootView, addWishlist, address, card, img, name,
          service);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
