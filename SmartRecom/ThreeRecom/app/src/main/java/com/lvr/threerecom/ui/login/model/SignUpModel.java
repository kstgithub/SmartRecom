package com.lvr.threerecom.ui.login.model;

import io.reactivex.Observable;

/**
 * Created by lvr on 2017/5/19.
 */

public interface SignUpModel {
    Observable<Boolean> loadSignUp(String username, String password);
}
