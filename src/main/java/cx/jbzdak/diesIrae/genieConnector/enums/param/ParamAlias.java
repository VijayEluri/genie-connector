/*
 * GenieConnector java library to connect with
 * Canberra Genie 2000 library
 * Copyright (C) 2009 Jacek Bzdak jbzdak@gmail.com
 *
 * This program was written for my BA in Faculty of Physics of
 * Warsaw University of Technology.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package cx.jbzdak.diesIrae.genieConnector.enums.param;

import cx.jbzdak.diesIrae.genieConnector.enums.paramType.ParameterType;
import edu.umd.cs.findbugs.annotations.NonNull;

/**
 * Created by IntelliJ IDEA.
 * User: Jacek Bzdak jbzdak@gmail.com
 */
public class ParamAlias<T> implements Parameter<T>{

    public static final ParamAlias<String> SAMPLE_IDENTIFIER = new ParamAlias<String>(Parameters.T_SIDENT);

    public static final ParamAlias<Float> SAMPLE_QUANTITY = new ParamAlias<Float>(Parameters.F_SQUANT);

    public static final ParamAlias<Long> CHANNEL_NUMBER = new ParamAlias<Long>(Parameters.L_CHANNELS);

    private final ParamImpl internal;

    ParamAlias(ParamImpl internal) {
        this.internal = internal;
    }

    @NonNull
    public short getByteLenght() {
        return internal.getByteLenght();
    }

    @NonNull
    public ParameterType<T> getType() {
        return internal.getType();
    }

    @NonNull
    public long getParamId() {
        return internal.getParamId();
    }
}
