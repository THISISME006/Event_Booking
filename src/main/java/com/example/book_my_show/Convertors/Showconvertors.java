package com.example.book_my_show.Convertors;

import com.example.book_my_show.EntryDtos.ShowEntryDto;
import com.example.book_my_show.Models.ShowEntity;

public class Showconvertors {
    public static ShowEntity convertEntryToEntity(ShowEntryDto showEntryDto){

        ShowEntity showEntity = ShowEntity.builder()
                .showDate(showEntryDto.getLocalDate())
                .showTime(showEntryDto.getLocalTime())
                .showType(showEntryDto.getShowType())
                .build();

        return showEntity;
    }
}
