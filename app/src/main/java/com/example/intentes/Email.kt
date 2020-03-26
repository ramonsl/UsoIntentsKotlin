package com.example.intentes

import android.os.Parcel
import android.os.Parcelable

data class Email(var para:String?,var assunto:String?, var msg: String?): Parcelable {
  constructor(parcel: Parcel) : this(
    parcel.readString(),
    parcel.readString(),
    parcel.readString()
  ) {
  }

  override fun writeToParcel(parcel: Parcel, flags: Int) {
    parcel.writeString(para)
    parcel.writeString(assunto)
    parcel.writeString(msg)
  }

  override fun describeContents(): Int {
    return 0
  }

  companion object CREATOR : Parcelable.Creator<Email> {
    override fun createFromParcel(parcel: Parcel): Email {
      return Email(parcel)
    }

    override fun newArray(size: Int): Array<Email?> {
      return arrayOfNulls(size)
    }
  }
}
