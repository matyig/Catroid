/*
 * Catroid: An on-device visual programming system for Android devices
 * Copyright (C) 2010-2016 The Catrobat Team
 * (<http://developer.catrobat.org/credits>)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * An additional term exception under section 7 of the GNU Affero
 * General Public License, version 3, is available at
 * http://developer.catrobat.org/license_additional_term
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.catrobat.catroid.content.actions;

import com.badlogic.gdx.scenes.scene2d.actions.TemporalAction;

import org.catrobat.catroid.utils.FlashUtil;

public class FlashAction extends TemporalAction {

	private static final int OFF = 0;
	private static final int ON = 1;
	private int turnFlash = OFF;

	@Override
	protected void update(float percent) {
		if (turnFlash == ON) {
			FlashUtil.flashOn();
		} else {
			FlashUtil.flashOff();
		}
	}

	public void turnFlashOn() {
		turnFlash = ON;
	}

	public void turnFlashOff() {
		turnFlash = OFF;
	}
}
