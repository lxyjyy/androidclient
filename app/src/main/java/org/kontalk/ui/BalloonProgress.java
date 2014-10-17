/*
 * Kontalk Android client
 * Copyright (C) 2014 Kontalk Devteam <devteam@kontalk.org>

 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.kontalk.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.widget.ImageView;

import org.kontalk.message.AttachmentComponent;

/**
 * @author Andrea Cappelli
 */
public interface BalloonProgress {
    public void buttonClick(long messageId, BalloonProgressControl balloonProgressControl,
                            AttachmentComponent attachment, ImageView button);
    public void onBind(BalloonProgressControl balloonProgressControl, Context context, BroadcastReceiver receiver);
    public void onUnBind(BalloonProgressControl balloonProgressControl, long messageId);

}
