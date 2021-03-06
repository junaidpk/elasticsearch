/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.core.ml.action;

import org.elasticsearch.common.xcontent.XContentParser;
import org.elasticsearch.test.AbstractStreamableXContentTestCase;
import org.elasticsearch.xpack.core.ml.action.GetCalendarsAction;
import org.elasticsearch.xpack.core.ml.action.util.PageParams;

public class GetCalendarsActionRequestTests extends AbstractStreamableXContentTestCase<GetCalendarsAction.Request> {

    @Override
    protected GetCalendarsAction.Request createTestInstance() {
        GetCalendarsAction.Request request = new GetCalendarsAction.Request();
        if (randomBoolean()) {
            request.setCalendarId(randomAlphaOfLengthBetween(1, 20));
        }
        if (randomBoolean()) {
            request.setPageParams(PageParams.defaultParams());
        }
        return request;
    }

    @Override
    protected GetCalendarsAction.Request createBlankInstance() {
        return new GetCalendarsAction.Request();
    }

    @Override
    protected GetCalendarsAction.Request doParseInstance(XContentParser parser) {
        return GetCalendarsAction.Request.parseRequest(null, parser);
    }

    @Override
    protected boolean supportsUnknownFields() {
        return false;
    }
}
