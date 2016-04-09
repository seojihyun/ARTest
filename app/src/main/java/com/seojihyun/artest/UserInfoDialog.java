package com.seojihyun.artest;

/**
 * Created by SEOJIHYUN on 2016-04-09.
 * 서지현_test1
 */
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserInfoDialog extends Dialog {

    private TextView mTitleView;
    private TextView mContentView;
    private EditText password;
    private Button mLeftButton;
    private Button mRightButton;
    private String mTitle;
    private String mContent;

    private Marker marker;

    private View.OnClickListener mLeftClickListener;
    private View.OnClickListener mRightClickListener;

    public UserInfoDialog(Context context, Marker marker) {
        super(context);

        this.marker = marker;

    }

    public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (keyCode == android.view.KeyEvent.KEYCODE_BACK)
            this.dismiss();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 다이얼로그 외부 화면 흐리게 표현
        WindowManager.LayoutParams lpWindow = new WindowManager.LayoutParams();
        lpWindow.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        lpWindow.dimAmount = 0.8f;
        getWindow().setAttributes(lpWindow);

        setContentView(R.layout.dialog_userinfo);

        mTitleView = (TextView) findViewById(R.id.dialog_userInfo_title);
        mLeftButton = (Button) findViewById(R.id.button_left);
        mRightButton = (Button) findViewById(R.id.button_right);

        // 사용자 이름 셋팅 테스트중 서지현
        mTitleView.setText(marker.getTitle());

        // 클릭 이벤트 셋팅
        /*if (mLeftClickListener != null && mRightClickListener != null) {
            mLeftButton.setOnClickListener(mLeftClickListener);
            mRightButton.setOnClickListener(mRightClickListener);
        } else if (mLeftClickListener != null
                && mRightClickListener == null) {
            mLeftButton.setOnClickListener(mLeftClickListener);
        } else {

        }
        */
    }
}
