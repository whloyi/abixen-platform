/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.abixen.platform.service.businessintelligence.multivisualisation.domain.model.util.dataFile;


import java.util.ArrayList;
import java.util.List;

public class DataFileDto {

    private RowDto rowTypes;
    private List<RowDto> rows = new ArrayList<>();

    public RowDto getRowTypes() {
        return rowTypes;
    }

    public void setRowTypes(RowDto rowTypes) {
        this.rowTypes = rowTypes;
    }

    public List<RowDto> getRows() {
        return rows;
    }

    public void setRows(List<RowDto> rows) {
        this.rows = rows;
    }

    public void addRow(RowDto rowDto) {
        rows.add(rowDto);
    }
}
