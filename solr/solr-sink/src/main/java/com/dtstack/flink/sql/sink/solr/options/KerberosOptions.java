/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dtstack.flink.sql.sink.solr.options;

import com.dtstack.flink.sql.krb.KerberosTable;

import java.io.Serializable;

/**
 * @author wuren
 * @program flinkStreamSQL
 * @create 2021/05/17
 */
public class KerberosOptions implements KerberosTable, Serializable {

    boolean enableKrb;
    private String principal;
    private String keytab;
    private String krb5conf;

    public KerberosOptions(String principal, String keytab, String krb5conf) {
        this.principal = principal;
        this.keytab = keytab;
        this.krb5conf = krb5conf;
    }

    @Override
    public String getPrincipal() {
        return principal;
    }

    @Override
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    @Override
    public String getKeytab() {
        return keytab;
    }

    @Override
    public void setKeytab(String keytab) {
        this.keytab = keytab;
    }

    @Override
    public String getKrb5conf() {
        return krb5conf;
    }

    @Override
    public void setKrb5conf(String krb5conf) {
        this.krb5conf = krb5conf;
    }

    @Override
    public boolean isEnableKrb() {
        return enableKrb;
    }

    @Override
    public void setEnableKrb(boolean enableKrb) {
        this.enableKrb = enableKrb;
    }
}
