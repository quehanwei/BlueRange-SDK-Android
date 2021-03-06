//
//  RelutionTagMessageActionMapperEmptyStub.java
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

package com.mway.bluerange.android.sdk.services.campaigns.trigger.registry;

import com.mway.bluerange.android.sdk.core.scanning.messages.RelutionTagMessageV1;
import com.mway.bluerange.android.sdk.services.campaigns.trigger.RelutionActionInformation;
import com.mway.bluerange.android.sdk.services.campaigns.trigger.RelutionActionRegistry;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class RelutionTagMessageActionMapperEmptyStub extends BeaconMessageActionMapperStub implements RelutionTagMessageActionMapper {

    private Map<Long, JSONObject> relutionActionMap = new HashMap<>();
    private boolean unexpectedUnavailable = false;

    public RelutionTagMessageActionMapperEmptyStub() {
    }

    @Override
    public RelutionActionInformation getBeaconActionInformation(RelutionTagMessageV1 relutionTagMessage)
            throws RelutionActionRegistry.UnsupportedMessageException, RelutionActionRegistry.RegistryNotAvailableException {
        throw new RelutionActionRegistry.RegistryNotAvailableException();
    }

    @Override
    public boolean isAvailable() {
        // Is always available
        return true;
    }
    public Map<Long, JSONObject> getTagActionMap() {
        return relutionActionMap;
    }
}
