package org.bboss.elasticsearchtest.apollo;
/**
 * Copyright 2020 bboss
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.frameworkset.util.SimpleStringUtil;
import org.frameworkset.elasticsearch.ElasticSearchHelper;
import org.frameworkset.elasticsearch.client.ClientInterface;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Description: </p>
 * <p></p>
 * <p>Copyright (c) 2020</p>
 * @Date 2020/8/10 9:16
 * @author biaoping.yin
 * @version 1.0
 */
public class TestApollo {
	@Test
	public void testIndiceGet(){
        Map dd = new HashMap();
        dd.put("ddd","xxx");
        SimpleStringUtil.object2json(dd);
		ClientInterface clientInterface = ElasticSearchHelper.getRestClientUtil();
        

		System.out.println(clientInterface.existIndice("demoqqqq"));
		do {
			try {
                System.out.println(clientInterface.existIndice("demo"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(3000l);
			} catch (Exception e) {
				break;
			}

		}
		while(true);
	}
}
