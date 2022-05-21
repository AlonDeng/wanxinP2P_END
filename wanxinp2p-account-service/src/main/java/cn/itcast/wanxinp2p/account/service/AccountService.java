package cn.itcast.wanxinp2p.account.service;

import cn.itcast.wanxinp2p.common.domain.RestResponse;

public interface AccountService {

    /**
     * 獲取手機驗證碼
     * @param mobile 手機號
     * @return
     */
    RestResponse getSMSCode(String mobile);
}
