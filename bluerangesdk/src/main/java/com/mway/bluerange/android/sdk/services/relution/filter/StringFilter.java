//
//  StringFilter.java
//  BlueRangeSDK
//
// Copyright (c) 2016-2017, M-Way Solutions GmbH
// All rights reserved.
//
// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
//

package com.mway.bluerange.android.sdk.services.relution.filter;

import org.json.JSONException;
import org.json.JSONObject;

public class StringFilter extends Filter {

    private String fieldName;
    private String value;

    public StringFilter(String fieldName, String value) {
        this.fieldName = fieldName;
        this.value = value;
    }

    @Override
    public JSONObject toJson() {
        JSONObject filter = new JSONObject();
        try {
            filter.put("type", "string");
            filter.put("fieldName", fieldName);
            filter.put("value", value);
            return filter;
        } catch (JSONException e) {

        }
        return filter;
    }
}
