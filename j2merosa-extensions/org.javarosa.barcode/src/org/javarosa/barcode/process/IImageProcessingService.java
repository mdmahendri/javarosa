/*
 * Copyright (C) 2009 JavaRosa
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.javarosa.barcode.process;

import javax.microedition.lcdui.Image;

import org.javarosa.core.model.data.IAnswerData;
import org.javarosa.core.services.IService;

/**
 * @author mel
 * 
 * A service that process and image and returns answer data
 *
 */
public interface IImageProcessingService extends IService {

	public String getName();

	public IAnswerData processImage(Image image)
			throws ImageProcessingException;

}