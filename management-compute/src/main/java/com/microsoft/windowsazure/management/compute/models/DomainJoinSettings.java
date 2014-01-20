/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

/**
* Optional.  Contains properties that specify a domain to which the virtual
* machine will be joined. This element is only used with the
* WindowsProvisioningConfiguration set.
*/
public class DomainJoinSettings
{
    private DomainJoinCredentials credentials;
    
    /**
    * Optional. Specifies the values to use to join the virtual machine to the
    * domain.
    * @return The Credentials value.
    */
    public DomainJoinCredentials getCredentials()
    {
        return this.credentials;
    }
    
    /**
    * Optional. Specifies the values to use to join the virtual machine to the
    * domain.
    * @param credentialsValue The Credentials value.
    */
    public void setCredentials(final DomainJoinCredentials credentialsValue)
    {
        this.credentials = credentialsValue;
    }
    
    private String domainToJoin;
    
    /**
    * Optional. Specifies the domain to join.
    * @return The DomainToJoin value.
    */
    public String getDomainToJoin()
    {
        return this.domainToJoin;
    }
    
    /**
    * Optional. Specifies the domain to join.
    * @param domainToJoinValue The DomainToJoin value.
    */
    public void setDomainToJoin(final String domainToJoinValue)
    {
        this.domainToJoin = domainToJoinValue;
    }
    
    private String ldapMachineObjectOU;
    
    /**
    * Optional. Specifies the Lightweight Directory Access Protocol (LDAP) X
    * 500-distinguished name of the organizational unit (OU) in which the
    * computer account is created. This account is in Active Directory on a
    * domain controller in the domain to which the computer is being joined.
    * Example: OU=MyOu,OU=MyParentOu,DC=example.com,DC=MyCompany,DC=com
    * @return The LdapMachineObjectOU value.
    */
    public String getLdapMachineObjectOU()
    {
        return this.ldapMachineObjectOU;
    }
    
    /**
    * Optional. Specifies the Lightweight Directory Access Protocol (LDAP) X
    * 500-distinguished name of the organizational unit (OU) in which the
    * computer account is created. This account is in Active Directory on a
    * domain controller in the domain to which the computer is being joined.
    * Example: OU=MyOu,OU=MyParentOu,DC=example.com,DC=MyCompany,DC=com
    * @param ldapMachineObjectOUValue The LdapMachineObjectOU value.
    */
    public void setLdapMachineObjectOU(final String ldapMachineObjectOUValue)
    {
        this.ldapMachineObjectOU = ldapMachineObjectOUValue;
    }
    
    private DomainJoinProvisioning provisioning;
    
    /**
    * Additional information for domain join provisioning.
    * @return The Provisioning value.
    */
    public DomainJoinProvisioning getProvisioning()
    {
        return this.provisioning;
    }
    
    /**
    * Additional information for domain join provisioning.
    * @param provisioningValue The Provisioning value.
    */
    public void setProvisioning(final DomainJoinProvisioning provisioningValue)
    {
        this.provisioning = provisioningValue;
    }
}
