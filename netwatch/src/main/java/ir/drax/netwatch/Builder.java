package ir.drax.netwatch;

import android.app.Activity;

public class Builder {
    private Activity activity;

    public Builder(Activity activity) {
        this.activity = activity;
    }

    public Builder setIcon(int icon){
        NetworkChangeReceiver.setNotificationIcon(icon);
        return this;
    }

    public Builder setCallBack(NetworkChangeReceiver_navigator uiNavigator){
        NetworkChangeReceiver.setUiNavigator(uiNavigator);
        return this;
    }


    public void build(){
        NetworkChangeReceiver.detectAndAct(activity);
    }

    public void setMessage(String message){
        NetworkChangeReceiver.setMessage(message);
    }
}