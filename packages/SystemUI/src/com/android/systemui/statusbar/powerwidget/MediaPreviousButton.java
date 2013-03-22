package com.android.systemui.statusbar.powerwidget;

import com.android.systemui.R;

import android.content.Context;
import android.view.KeyEvent;

public class MediaPreviousButton extends MediaKeyEventButton {
    public MediaPreviousButton() { mType = BUTTON_MEDIA_PREVIOUS; }

    @Override
    protected void updateState(Context context) {
        mIcon = R.drawable.stat_media_previous;
        mState = STATE_DISABLED;
        setText(context.getResources().getString(R.string.powerwidget_previous), TEXT_COLOR_ENABLE);
    }

    @Override
    protected void toggleState(Context context) {
        sendMediaKeyEvent(context, KeyEvent.KEYCODE_MEDIA_PREVIOUS);
    }

    @Override
    protected boolean handleLongClick(Context context) {
        return false;
    }
}
