/*
 * Copyright 2014 Stormpath, Inc.
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
package com.stormpath.sdk.servlet.filter.account;

import com.stormpath.sdk.client.Client;
import com.stormpath.sdk.servlet.Servlets;
import com.stormpath.sdk.servlet.config.Config;
import com.stormpath.sdk.servlet.config.ConfigResolver;
import com.stormpath.sdk.servlet.config.CookieConfig;

import javax.servlet.http.HttpServletRequest;

public abstract class AccountCookieHandler {

    protected Config getConfig(HttpServletRequest request) {
        return ConfigResolver.INSTANCE.getConfig(request.getServletContext());
    }

    protected Client getClient(HttpServletRequest request) {
        return Servlets.getClient(request);
    }

    protected CookieConfig getAccountCookieConfig(HttpServletRequest request) {
        return getConfig(request).getAccountCookieConfig();
    }

}