package org.codehaus.mojo.gwt.servlets;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.util.Collection;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class HelloRemoteServlet extends RemoteServiceServlet implements HelloRemoteService {
	public void init()  {
		System.out.println("HelloRemoteServlet started");
	}

	public void exit() {
	}

	public Collection<Integer> returnsGenerics(List<String> values) {
		return null;
	}

	@Override
	public int returnsPrimitive(String[] values) {
		return 0;
	}

	@Override
	public void returnsVoid(String value) {

	}

	@Override
	public String[] returnsArray(String[] values) {
		return new String[0];
	}

}
