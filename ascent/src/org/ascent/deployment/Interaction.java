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


package org.ascent.deployment;

public class Interaction extends ModelElement {
	private Component[] participants_;
	protected double rate_;

	public Interaction(int id, String label, int[] resources, double rate) {
		super(id, label, resources);
		rate_ = rate;
	}

	public Component[] getParticipants() {
		return participants_;
	}

	public void setParticipants(Component[] participants) {
		participants_ = participants;
	}

	public double getRate() {
		return rate_;
	}

	public void setRate(double rate) {
		rate_ = rate;
	}

}
