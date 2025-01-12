// Generated by view binder compiler. Do not edit!
package com.techvista.apnajanver.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.techvista.apnajanver.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MyoderRvBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView date;

  @NonNull
  public final TextView location;

  @NonNull
  public final CardView oddersummer;

  @NonNull
  public final TextView orderid;

  @NonNull
  public final TextView paisa;

  @NonNull
  public final TextView productname;

  @NonNull
  public final TextView reptoder;

  @NonNull
  public final TextView time;

  private MyoderRvBinding(@NonNull LinearLayout rootView, @NonNull TextView date,
      @NonNull TextView location, @NonNull CardView oddersummer, @NonNull TextView orderid,
      @NonNull TextView paisa, @NonNull TextView productname, @NonNull TextView reptoder,
      @NonNull TextView time) {
    this.rootView = rootView;
    this.date = date;
    this.location = location;
    this.oddersummer = oddersummer;
    this.orderid = orderid;
    this.paisa = paisa;
    this.productname = productname;
    this.reptoder = reptoder;
    this.time = time;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MyoderRvBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MyoderRvBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.myoder_rv, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MyoderRvBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.date;
      TextView date = ViewBindings.findChildViewById(rootView, id);
      if (date == null) {
        break missingId;
      }

      id = R.id.location;
      TextView location = ViewBindings.findChildViewById(rootView, id);
      if (location == null) {
        break missingId;
      }

      id = R.id.oddersummer;
      CardView oddersummer = ViewBindings.findChildViewById(rootView, id);
      if (oddersummer == null) {
        break missingId;
      }

      id = R.id.orderid;
      TextView orderid = ViewBindings.findChildViewById(rootView, id);
      if (orderid == null) {
        break missingId;
      }

      id = R.id.paisa;
      TextView paisa = ViewBindings.findChildViewById(rootView, id);
      if (paisa == null) {
        break missingId;
      }

      id = R.id.productname;
      TextView productname = ViewBindings.findChildViewById(rootView, id);
      if (productname == null) {
        break missingId;
      }

      id = R.id.reptoder;
      TextView reptoder = ViewBindings.findChildViewById(rootView, id);
      if (reptoder == null) {
        break missingId;
      }

      id = R.id.time;
      TextView time = ViewBindings.findChildViewById(rootView, id);
      if (time == null) {
        break missingId;
      }

      return new MyoderRvBinding((LinearLayout) rootView, date, location, oddersummer, orderid,
          paisa, productname, reptoder, time);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
