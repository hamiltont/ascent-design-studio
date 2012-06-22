 /**************************************************************************
 * Copyright 2008 Jules White                                              *
 *                                                                         *
 * Licensed under the Apache License, Version 2.0 (the "License");         *
 * you may not use this file except in compliance with the License.        *
 * You may obtain a copy of the License at                                 *
 *                                                                         *
 * http://www.apache.org/licenses/LICENSE-2.0                              *
 *                                                                         *
 * Unless required by applicable law or agreed to in writing, software     *
 * distributed under the License is distributed on an "AS IS" BASIS,       *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.*
 * See the License for the specific language governing permissions and     *
 * limitations under the License.                                          *
 **************************************************************************/

package org.ascent.mmkp;

import java.util.ArrayList;
import java.util.List;

public class SeedableMMKP extends MMKP {

	private List<List<Item>> seeds_ = new ArrayList<List<Item>>();

	public SeedableMMKP(MMKPProblem problem) {
		super(problem);
	}

	public List<List<Item>> getSeeds() {
		return seeds_;
	}

	public void setSeeds(List<List<Item>> seeds) {
		seeds_ = seeds;
	}
	
	
}
