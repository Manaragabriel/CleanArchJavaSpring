package com.cleanArchRef.application.shared;

public interface IUseCase <I, O> {
    O execute(I input);
}
