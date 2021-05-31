/*
 * Copyright 2021 LENA Development Team.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package io.openlena.ctl.type;

/**
 * Enum defined install command
 * @author Erick Yu
 *
 */
public enum InstallerCommandType {
	CREATE("create");

	private String command;

	InstallerCommandType(String command) {
		this.command = command;
	}

	/**
	 * @return command
	 */
	public String getCommand() {
		return command;
	}
}
