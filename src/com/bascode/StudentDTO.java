package com.bascode;

import java.util.List;

public record StudentDTO(
		int id,
		String userName,
		String position,
		List<String> tech
		) {}
