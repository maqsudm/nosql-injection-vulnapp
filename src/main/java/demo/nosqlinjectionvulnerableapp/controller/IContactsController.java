/*
 * Copyright (C) 2022 Anton Abashkin and contributors as noted in the AUTHORS file
 * SPDX-License-Identifier: MIT
 */

package demo.nosqlinjectionvulnerableapp.controller;

import java.util.List;

import org.bson.Document;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface IContactsController {

    public List<Document> basicDBObjectPut(@RequestParam String email, Authentication authentication);

	public List<Document> basicDBObjectPutAll(@RequestParam String email, Authentication authentication);

	public List<Document> basicDBObjectAppend(@RequestParam String email, Authentication authentication);

	public List<Document> basicDBObjectConstructorKv(@RequestParam String email, Authentication authentication);

	public List<Document> basicDBObjectConstructorMap(@RequestParam String email, Authentication authentication);

	public List<Document> basicDBObjectParse(@RequestParam String email, Authentication authentication);

	public List<Document> basicDBObjectBuilderAdd(@RequestParam String email, Authentication authentication);

	public List<Document> basicDBObjectBuilderAppend(@RequestParam String email, Authentication authentication);

	public List<Document> basicDBObjectBuilderStartKv(@RequestParam String email, Authentication authentication);

	public List<Document> basicDBObjectBuilderStartMap(@RequestParam String email, Authentication authentication);

}