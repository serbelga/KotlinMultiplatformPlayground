//
//  MainViewModel.swift
//  iosApp
//
//  Created by Sergio Belda on 30/01/2021.
//  Copyright © 2021 orgName. All rights reserved.
//

import Foundation
import shared

class MainViewModel: ObservableObject {

    private let songsRepository: SongsRepository
    
    init(songsRepository: SongsRepository) {
        self.songsRepository = songsRepository
    }
    
    func getSongs() -> Array<String> {
        return songsRepository.getSongs()
    }
}
