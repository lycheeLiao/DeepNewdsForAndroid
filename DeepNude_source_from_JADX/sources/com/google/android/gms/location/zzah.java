package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Hide;
import com.google.android.gms.internal.zzbgm;

@Hide
public final class zzah implements Creator<LocationSettingsResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i = SupportMenu.USER_MASK & readInt;
            if (i == 1) {
                status = (Status) zzbgm.zza(parcel, readInt, Status.CREATOR);
            } else if (i != 2) {
                zzbgm.zzb(parcel, readInt);
            } else {
                locationSettingsStates = (LocationSettingsStates) zzbgm.zza(parcel, readInt, LocationSettingsStates.CREATOR);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsResult[i];
    }
}
