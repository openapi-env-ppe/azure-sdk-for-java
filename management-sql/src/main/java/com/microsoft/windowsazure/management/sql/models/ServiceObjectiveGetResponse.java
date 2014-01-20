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

package com.microsoft.windowsazure.management.sql.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;

/**
* Response containing the service objective for a given server and service
* objective Id.
*/
public class ServiceObjectiveGetResponse extends OperationResponse
{
    private String description;
    
    /**
    * Gets or sets the service objective description.
    * @return The Description value.
    */
    public String getDescription()
    {
        return this.description;
    }
    
    /**
    * Gets or sets the service objective description.
    * @param descriptionValue The Description value.
    */
    public void setDescription(final String descriptionValue)
    {
        this.description = descriptionValue;
    }
    
    private ArrayList<ServiceObjectiveGetResponse.DimensionSettingResponse> dimensionSettings;
    
    /**
    * Gets or sets the service objective dimension settings.
    * @return The DimensionSettings value.
    */
    public ArrayList<ServiceObjectiveGetResponse.DimensionSettingResponse> getDimensionSettings()
    {
        return this.dimensionSettings;
    }
    
    /**
    * Gets or sets the service objective dimension settings.
    * @param dimensionSettingsValue The DimensionSettings value.
    */
    public void setDimensionSettings(final ArrayList<ServiceObjectiveGetResponse.DimensionSettingResponse> dimensionSettingsValue)
    {
        this.dimensionSettings = dimensionSettingsValue;
    }
    
    private boolean enabled;
    
    /**
    * Gets or sets a value indicating whether the service objective is enabled.
    * @return The Enabled value.
    */
    public boolean isEnabled()
    {
        return this.enabled;
    }
    
    /**
    * Gets or sets a value indicating whether the service objective is enabled.
    * @param enabledValue The Enabled value.
    */
    public void setEnabled(final boolean enabledValue)
    {
        this.enabled = enabledValue;
    }
    
    private String id;
    
    /**
    * Gets or sets the service objective id.
    * @return The Id value.
    */
    public String getId()
    {
        return this.id;
    }
    
    /**
    * Gets or sets the service objective id.
    * @param idValue The Id value.
    */
    public void setId(final String idValue)
    {
        this.id = idValue;
    }
    
    private boolean isDefault;
    
    /**
    * Gets or sets a value indicating whether the service objective is the
    * default objective.
    * @return The IsDefault value.
    */
    public boolean isDefault()
    {
        return this.isDefault;
    }
    
    /**
    * Gets or sets a value indicating whether the service objective is the
    * default objective.
    * @param isDefaultValue The IsDefault value.
    */
    public void setIsDefault(final boolean isDefaultValue)
    {
        this.isDefault = isDefaultValue;
    }
    
    private boolean isSystem;
    
    /**
    * Gets or sets a value indicating whether the service objective is a system
    * objective.
    * @return The IsSystem value.
    */
    public boolean isSystem()
    {
        return this.isSystem;
    }
    
    /**
    * Gets or sets a value indicating whether the service objective is a system
    * objective.
    * @param isSystemValue The IsSystem value.
    */
    public void setIsSystem(final boolean isSystemValue)
    {
        this.isSystem = isSystemValue;
    }
    
    private String name;
    
    /**
    * Gets or sets the name of the service objective.
    * @return The Name value.
    */
    public String getName()
    {
        return this.name;
    }
    
    /**
    * Gets or sets the name of the service objective.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue)
    {
        this.name = nameValue;
    }
    
    private String parentLink;
    
    /**
    * Gets or sets the ParentLink of the service objective.
    * @return The ParentLink value.
    */
    public String getParentLink()
    {
        return this.parentLink;
    }
    
    /**
    * Gets or sets the ParentLink of the service objective.
    * @param parentLinkValue The ParentLink value.
    */
    public void setParentLink(final String parentLinkValue)
    {
        this.parentLink = parentLinkValue;
    }
    
    private String selfLink;
    
    /**
    * Gets or sets the SelfLink of the service objective.
    * @return The SelfLink value.
    */
    public String getSelfLink()
    {
        return this.selfLink;
    }
    
    /**
    * Gets or sets the SelfLink of the service objective.
    * @param selfLinkValue The SelfLink value.
    */
    public void setSelfLink(final String selfLinkValue)
    {
        this.selfLink = selfLinkValue;
    }
    
    private String state;
    
    /**
    * Gets or sets the state of the service objective.
    * @return The State value.
    */
    public String getState()
    {
        return this.state;
    }
    
    /**
    * Gets or sets the state of the service objective.
    * @param stateValue The State value.
    */
    public void setState(final String stateValue)
    {
        this.state = stateValue;
    }
    
    private String type;
    
    /**
    * Gets or sets the type of resource.
    * @return The Type value.
    */
    public String getType()
    {
        return this.type;
    }
    
    /**
    * Gets or sets the type of resource.
    * @param typeValue The Type value.
    */
    public void setType(final String typeValue)
    {
        this.type = typeValue;
    }
    
    /**
    * Initializes a new instance of the ServiceObjectiveGetResponse class.
    *
    */
    public ServiceObjectiveGetResponse()
    {
        super();
        this.dimensionSettings = new ArrayList<ServiceObjectiveGetResponse.DimensionSettingResponse>();
    }
    
    /**
    * Dimension setting.
    */
    public static class DimensionSettingResponse
    {
        private String description;
        
        /**
        * Gets or sets the dimension setting description.
        * @return The Description value.
        */
        public String getDescription()
        {
            return this.description;
        }
        
        /**
        * Gets or sets the dimension setting description.
        * @param descriptionValue The Description value.
        */
        public void setDescription(final String descriptionValue)
        {
            this.description = descriptionValue;
        }
        
        private String id;
        
        /**
        * Gets or sets the dimension setting id.
        * @return The Id value.
        */
        public String getId()
        {
            return this.id;
        }
        
        /**
        * Gets or sets the dimension setting id.
        * @param idValue The Id value.
        */
        public void setId(final String idValue)
        {
            this.id = idValue;
        }
        
        private boolean isDefault;
        
        /**
        * Gets or sets a value indicating whether the dimension setting is the
        * default setting.
        * @return The IsDefault value.
        */
        public boolean isDefault()
        {
            return this.isDefault;
        }
        
        /**
        * Gets or sets a value indicating whether the dimension setting is the
        * default setting.
        * @param isDefaultValue The IsDefault value.
        */
        public void setIsDefault(final boolean isDefaultValue)
        {
            this.isDefault = isDefaultValue;
        }
        
        private String name;
        
        /**
        * Gets or sets the name of the dimension setting.
        * @return The Name value.
        */
        public String getName()
        {
            return this.name;
        }
        
        /**
        * Gets or sets the name of the dimension setting.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue)
        {
            this.name = nameValue;
        }
        
        private byte ordinal;
        
        /**
        * Gets or sets the dimension setting ordinal position.
        * @return The Ordinal value.
        */
        public byte getOrdinal()
        {
            return this.ordinal;
        }
        
        /**
        * Gets or sets the dimension setting ordinal position.
        * @param ordinalValue The Ordinal value.
        */
        public void setOrdinal(final byte ordinalValue)
        {
            this.ordinal = ordinalValue;
        }
        
        private String parentLink;
        
        /**
        * Gets or sets the ParentLink of the dimension setting.
        * @return The ParentLink value.
        */
        public String getParentLink()
        {
            return this.parentLink;
        }
        
        /**
        * Gets or sets the ParentLink of the dimension setting.
        * @param parentLinkValue The ParentLink value.
        */
        public void setParentLink(final String parentLinkValue)
        {
            this.parentLink = parentLinkValue;
        }
        
        private String selfLink;
        
        /**
        * Gets or sets the SelfLink of the dimension setting.
        * @return The SelfLink value.
        */
        public String getSelfLink()
        {
            return this.selfLink;
        }
        
        /**
        * Gets or sets the SelfLink of the dimension setting.
        * @param selfLinkValue The SelfLink value.
        */
        public void setSelfLink(final String selfLinkValue)
        {
            this.selfLink = selfLinkValue;
        }
        
        private String state;
        
        /**
        * Gets or sets the state of the dimension setting.
        * @return The State value.
        */
        public String getState()
        {
            return this.state;
        }
        
        /**
        * Gets or sets the state of the dimension setting.
        * @param stateValue The State value.
        */
        public void setState(final String stateValue)
        {
            this.state = stateValue;
        }
        
        private String type;
        
        /**
        * Gets or sets the type of resource.
        * @return The Type value.
        */
        public String getType()
        {
            return this.type;
        }
        
        /**
        * Gets or sets the type of resource.
        * @param typeValue The Type value.
        */
        public void setType(final String typeValue)
        {
            this.type = typeValue;
        }
    }
}
