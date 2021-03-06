/*
 * Copyright (C) 2015 The Android Open Source Project
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

package androidx.test;

import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;

import androidx.test.filters.SmallTest;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class FailureAssumptionTest {
  @Test
  public void checkAssumptionIsSkipped() {
    assumeTrue(false);
    fail("Tests with failing assumptions should be skipped");
  }

  @Test
  @Ignore
  public void checkIgnoreTestsArePossible() {
    fail("Tests with @Ignore annotation should be skipped");
  }
}
