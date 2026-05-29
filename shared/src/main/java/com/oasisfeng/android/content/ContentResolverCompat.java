package com.oasisfeng.android.content;

import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

public final class ContentResolverCompat {

    private ContentResolverCompat() {}

    public static Bundle call(final Context context, final Uri uri, final String method, final String arg, final Bundle extras) {
        return context.getContentResolver().call(uri, method, arg, extras);
    }

    public static Cursor query(final Context context, final Uri uri) {
        return context.getContentResolver().query(uri, null, null, null, null);
    }

    public static int update(final Context context, final Uri uri, final ContentValues values) {
        return context.getContentResolver().update(uri, values, null, null);
    }

    public static void registerContentObserver(final Context context, final Uri uri, final boolean notifyForDescendants, final ContentObserver observer) {
        context.getContentResolver().registerContentObserver(uri, notifyForDescendants, observer);
    }
}
