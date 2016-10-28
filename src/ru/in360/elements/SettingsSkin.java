/*
 * This file is part of in360TourBuilder.
 *
 *     in360TourBuilder is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     in360TourBuilder is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Этот файл — часть in360TourBuilder.
 *
 *    in360TourBuilder - свободная программа: вы можете перераспространять ее и/или
 *    изменять ее на условиях Стандартной общественной лицензии GNU в том виде,
 *    в каком она была опубликована Фондом свободного программного обеспечения;
 *    либо версии 3 лицензии, либо (по вашему выбору) любой более поздней
 *    версии.
 *
 *    in360TourBuilder распространяется в надежде, что она будет полезной,
 *    но БЕЗО ВСЯКИХ ГАРАНТИЙ; даже без неявной гарантии ТОВАРНОГО ВИДА
 *    или ПРИГОДНОСТИ ДЛЯ ОПРЕДЕЛЕННЫХ ЦЕЛЕЙ. Подробнее см. в Стандартной
 *    общественной лицензии GNU.
 *
 *    Вы должны были получить копию Стандартной общественной лицензии GNU
 *    вместе с этой программой. Если это не так, см.
 *    <http://www.gnu.org/licenses/>.
 *
 * 06.11.14 1:47 Anton Fomchenko 360@in360.ru
 */

package ru.in360.elements;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.HashMap;
import java.util.Map;


public class SettingsSkin implements Settings {
    private static final long serialVersionUID = 8880783255791503949L;
    private Map<String, String> settings;

    public SettingsSkin() {
        settings = new HashMap<>();
    }

    @Override
    public void addElement(String name, String element) {
        settings.put(name, element);
    }

    @Override
    public void removeElement(String name) {
        settings.remove(name);
    }

    @Override
    public Element getXMLElement(Document doc) {
        Element settingsTag = doc.createElement("skin_settings");
        for (Map.Entry<String, String> entry : settings.entrySet()) {
            settingsTag.setAttribute(entry.getKey(), entry.getValue());
        }
        return settingsTag;
    }
}
