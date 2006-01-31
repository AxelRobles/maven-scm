package org.apache.maven.scm.provider.perforce.command;

/*
 * Copyright 2001-2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.codehaus.plexus.util.cli.StreamConsumer;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author mperham
 * @version $Id$
 */
public abstract class AbstractPerforceConsumer
    implements StreamConsumer
{
    private StringWriter out = new StringWriter();

    protected PrintWriter output = new PrintWriter( out );

    public String getOutput()
    {
        output.flush();
        out.flush();
        return out.toString();
    }

}