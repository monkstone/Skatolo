/* 
 *  controlP5 is a processing gui library.
 * 
 * Copyright (C)  2006-2012 by Andreas Schlegel
 * Copyright (C)  2015 by Jeremy Laviole
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 * 
 * 
 */
package fr.inria.controlP5.gui.group;

import fr.inria.controlP5.ControlP5;
import fr.inria.controlP5.gui.group.RadioButton;

/*
 * Backwards compatibility, cp5magic for example uses it. 
 * But if possible, upgrade to RadioButton
 */

public class Radio extends RadioButton {

	public Radio(ControlP5 theControlP5, ControllerGroup<?> theParent, String theName, int theX, int theY) {
		super(theControlP5, theParent, theName, theX, theY);
	}

}