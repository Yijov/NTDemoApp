package com.yirbett.ntdemo.Pokemon;

import java.util.List;

public record PokemonResponse(Integer count, String next, String previous, Object[] results) { }
