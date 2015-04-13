/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wcs.netbeans.liquiface.model.util;

/*
 * #%L
 * Liquiface - GUI for Liquibase
 * %%
 * Copyright (C) 2013 Webstar Csoport Kft.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import liquibase.change.ColumnConfig;

/**
 *
 * @author tveki
 */
public class ColumnConfigUtil {

    public static boolean isUnique(ColumnConfig config) {
        if (config.getConstraints() != null
                && config.getConstraints().isUnique() != null){
            return config.getConstraints().isUnique();
        }
        //DEFAULT
        return false;        
    }
    
    public static boolean isPrimaryKey(ColumnConfig config) {
        if (config.getConstraints() != null
                && config.getConstraints().isPrimaryKey() != null){
            return config.getConstraints().isPrimaryKey();
        }
        return false;
    }

    public static boolean isNullable(ColumnConfig config) {
        if (config.getConstraints() != null
                && config.getConstraints().isNullable() != null){
            return config.getConstraints().isNullable();
        }
        //DEFAULT
        return true;
    }
    
    public static boolean isNotNull(ColumnConfig config) {
        return !isNullable(config);
    }    
    
}
