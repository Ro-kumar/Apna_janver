// Generated by view binder compiler. Do not edit!
package com.techvista.apnajanver.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.skydoves.elasticviews.ElasticButton;
import com.techvista.apnajanver.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class EnquiryLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ElasticButton btnSubmit;

  @NonNull
  public final ImageView close;

  @NonNull
  public final TextInputEditText etAddress;

  @NonNull
  public final TextInputEditText etDiscription;

  @NonNull
  public final TextInputEditText etMobile;

  @NonNull
  public final TextInputEditText restarundId;

  private EnquiryLayoutBinding(@NonNull LinearLayout rootView, @NonNull ElasticButton btnSubmit,
      @NonNull ImageView close, @NonNull TextInputEditText etAddress,
      @NonNull TextInputEditText etDiscription, @NonNull TextInputEditText etMobile,
      @NonNull TextInputEditText restarundId) {
    this.rootView = rootView;
    this.btnSubmit = btnSubmit;
    this.close = close;
    this.etAddress = etAddress;
    this.etDiscription = etDiscription;
    this.etMobile = etMobile;
    this.restarundId = restarundId;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EnquiryLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EnquiryLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.enquiry_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EnquiryLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_submit;
      ElasticButton btnSubmit = ViewBindings.findChildViewById(rootView, id);
      if (btnSubmit == null) {
        break missingId;
      }

      id = R.id.close;
      ImageView close = ViewBindings.findChildViewById(rootView, id);
      if (close == null) {
        break missingId;
      }

      id = R.id.et_address;
      TextInputEditText etAddress = ViewBindings.findChildViewById(rootView, id);
      if (etAddress == null) {
        break missingId;
      }

      id = R.id.et_discription;
      TextInputEditText etDiscription = ViewBindings.findChildViewById(rootView, id);
      if (etDiscription == null) {
        break missingId;
      }

      id = R.id.et_mobile;
      TextInputEditText etMobile = ViewBindings.findChildViewById(rootView, id);
      if (etMobile == null) {
        break missingId;
      }

      id = R.id.restarund_id;
      TextInputEditText restarundId = ViewBindings.findChildViewById(rootView, id);
      if (restarundId == null) {
        break missingId;
      }

      return new EnquiryLayoutBinding((LinearLayout) rootView, btnSubmit, close, etAddress,
          etDiscription, etMobile, restarundId);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
