package com.company.ext;

import com.haulmont.cuba.web.testsupport.TestContainer;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtWebTestContainer extends TestContainer {

    public ExtWebTestContainer() {
        appComponents = Arrays.asList(
                "com.haulmont.cuba",
                "com.company.clinic");
        appPropertiesFiles = Arrays.asList(
                // List the files defined in your web.xml
                // in appPropertiesConfig context parameter of the web module
                "com/company/ext/web-app.properties",
                // Add this file which is located in CUBA and defines some properties
                // specifically for test environment. You can replace it with your own
                // or add another one in the end.
                "com/haulmont/cuba/web/testsupport/test-web-app.properties"
        );
    }

    public static class Common extends ExtWebTestContainer {

        // A common singleton instance of the test container which is initialized once for all tests
        public static final ExtWebTestContainer.Common INSTANCE = new ExtWebTestContainer.Common();

        private static volatile boolean initialized;

        private Common() {
        }

        @Override
        public void before() throws Throwable {
            if (!initialized) {
                super.before();
                initialized = true;
            }
            setupContext();
        }

        @Override
        public void after() {
            cleanupContext();
            // never stops - do not call super
        }
    }
}