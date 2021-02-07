/*
 * Copyright 2017-2021 Baidu Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.baidu.openrasp.plugin.checker.policy.server;

import com.baidu.openrasp.plugin.checker.CheckParameter;
import com.baidu.openrasp.plugin.info.EventInfo;

import java.util.List;

/**
 * @description: jboss eap 基线检测
 * @author: anyang
 * @create: 2019/03/15 17:02
 */
public class JBossEAPSecurityChecker extends ServerPolicyChecker {

    public JBossEAPSecurityChecker() {
    }

    public JBossEAPSecurityChecker(boolean canBlock) {
        super(canBlock);
    }

    @Override
    public void checkServer(CheckParameter checkParameter, List<EventInfo> infos) {

    }
}
